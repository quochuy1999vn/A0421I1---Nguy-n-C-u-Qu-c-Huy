import { Component, OnInit } from '@angular/core';
import {Todo} from '../../model/todo';
import {TodoService} from '../../service/todo.service';

@Component({
  selector: 'app-list-todo',
  templateUrl: './list-todo.component.html',
  styleUrls: ['./list-todo.component.css']
})
export class ListTodoComponent implements OnInit {

  todos: Todo[] = [];
  constructor(private todoService: TodoService) { }

  ngOnInit() {
    this.getAll();
  }

  getAll() {
    this.todos = this.todoService.getAll();
  }

}
