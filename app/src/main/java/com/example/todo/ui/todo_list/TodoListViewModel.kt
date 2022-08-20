package com.example.todo.ui.todo_list

import androidx.lifecycle.ViewModel
import com.example.todo.data.TodoRepository
import com.example.todo.utils.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

@HiltViewModel
class TodoListViewModel @Inject constructor(
    private val repository: TodoRepository
) : ViewModel() {

    val todos =repository.getTodos()

    val _uiEvent = Channel<UiEvent> ()
    val uiEvent =_uiEvent.receiveAsFlow()

    fun onEvent(event: TodoListEvent){
        when(event){
            is TodoListEvent.OnTodoClick ->{

            }
            is TodoListEvent.OAddTodoClick ->{

            }
            is TodoListEvent.OnUndoDeleteClick->{

            }
            is TodoListEvent.OnDeleteTodoClick ->{

            }
            is TodoListEvent.OnDoneChange ->{

            }
        }
    }
}