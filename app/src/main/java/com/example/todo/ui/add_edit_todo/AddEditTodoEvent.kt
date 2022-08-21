package com.example.todo.ui.add_edit_todo

sealed class AddEditTodoEvent{
    data class OnTitelChange(val titel:String):AddEditTodoEvent()
    data class OnDescriptionChange(val description:String):AddEditTodoEvent()
    object OnSaveTodoClick: AddEditTodoEvent()
}
