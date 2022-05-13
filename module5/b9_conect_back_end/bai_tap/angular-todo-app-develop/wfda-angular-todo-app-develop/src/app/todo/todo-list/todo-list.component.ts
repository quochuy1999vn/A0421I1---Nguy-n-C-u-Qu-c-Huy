import { Component, OnInit } from '@angular/core';
import {TodoService} from '../../todo.service';
import {Todo} from '../../todo';
import {FormControl, FormGroup} from '@angular/forms';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})
export class TodoListComponent implements OnInit {

  todos: Todo[];
  id: number;

  todoForm: FormGroup = new FormGroup({
    content: new FormControl()
  });
  constructor(private todoService: TodoService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {}

  ngOnInit() {
    this.getAll();
  }

  getAll() {
    return this.todoService.getAll().subscribe(todo => {
      this.todos = todo;
    });
  }

  toggleTodo(i: number) {
    this.todos[i].complete = !this.todos[i].complete;
  }

  getTodo(id: number) {
    return this.todoService.findById(id).subscribe(todo => {
      this.todoForm = new FormGroup({
        content: new FormControl(todo.content),
      });
    });
  }
}
