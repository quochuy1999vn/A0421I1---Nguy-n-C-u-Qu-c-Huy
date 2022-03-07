import { Component, OnInit } from '@angular/core';
import {Todo} from '../../model/todo';
import {FormControl, FormGroup} from '@angular/forms';
import {TodoService} from '../../service/todo.service';

@Component({
  selector: 'app-create-todo',
  templateUrl: './create-todo.component.html',
  styleUrls: ['./create-todo.component.css']
})
export class CreateTodoComponent implements OnInit {

  todos: FormGroup = new FormGroup({
    id: new FormControl(),
    cardName: new FormControl(),
    email: new FormControl(),
    phone: new FormControl()
  });


  constructor(private todoService: TodoService) { }

  ngOnInit() {
  }

  submit() {
    const todo = this.todos.value;
    this.todoService.saveTodo(todo);
    this.todos.reset();
  }
}
