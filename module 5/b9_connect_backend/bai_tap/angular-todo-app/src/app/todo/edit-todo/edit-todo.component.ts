import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {TodoService} from '../../service/todo.service';
import {ActivatedRoute, ParamMap} from '@angular/router';

@Component({
  selector: 'app-edit-todo',
  templateUrl: './edit-todo.component.html',
  styleUrls: ['./edit-todo.component.css']
})
export class EditTodoComponent implements OnInit {

  todos: FormGroup;
  id: number;
  constructor(private todoService: TodoService,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      const todo = this.getTodo(this.id);
      this.todos = new FormGroup({
        id: new FormControl(todo.id),
        name: new FormControl(todo.name),
        email: new FormControl(todo.email),
        phone: new FormControl(todo.phone)
      });
    });

    }

  ngOnInit() {
  }

  getTodo(id: number) {
    return this.todoService.findById(id);
  }

  updateTodo(id: number) {
    const todo = this.todos.value;
    this.todoService.updateTodo(id, todo);
    alert('Cập nhật thành công');
  }
}
