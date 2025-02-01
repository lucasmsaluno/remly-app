package com.example.remly.presentation.viewmodels
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ReminderViewModel: ViewModel() {
    var taskInput by mutableStateOf("")
        private set

    var hours by mutableStateOf("00")
        private set
    var minutes by mutableStateOf("00")
        private set
    var dayPeriod by mutableStateOf("PM")
        private set

    val selectedDays = mutableStateListOf<Int>()

    fun updateTaskInput (newInput: String) {
        taskInput = newInput
    }

    fun updateHours(updateType: String) {
        var convertedHours = hours.toInt()

        when (updateType) {
            "increase" -> {
                convertedHours = if (convertedHours == 12) 1 else convertedHours + 1
            }
            "decrease" -> {
                convertedHours = if (convertedHours == 1) 12 else (convertedHours - 1).coerceAtLeast(1)
            }
        }

        hours = convertedHours.toString().padStart(2, '0')
    }

    fun updateMinutes(updateType: String) {
        var convertedMinutes = minutes.toInt()

        when (updateType) {
            "increase" -> {
                convertedMinutes = (convertedMinutes + 1) % 60
                if (convertedMinutes == 0) updateHours("increase")
            }
            "decrease" -> {
                convertedMinutes = if (convertedMinutes == 0) 59 else convertedMinutes - 1
                if (convertedMinutes == 59) updateHours("decrease")
            }
        }

        minutes = convertedMinutes.toString().padStart(2, '0')
    }

    fun updateDayPeriod() {
        dayPeriod = if (dayPeriod == "AM") "PM" else "AM"
    }

    fun toggleDaySelection(index: Int) {
        if (index in selectedDays) {
            selectedDays.remove(index)
        } else {
            selectedDays.add(index)
        }
    }

}