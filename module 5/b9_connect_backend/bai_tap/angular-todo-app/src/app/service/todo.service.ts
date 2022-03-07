import { Injectable } from '@angular/core';
import {Todo} from '../model/todo';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  public apiURL = 'http://localhost:3000/todos';

  todos = [];
  constructor(private http: HttpClient) { }

  getAll() {
    return this.todos;
  }

  findById(id: number) {
    return this.todos.find(todo => todo.id === id);
  }

  saveTodo(todo): Observable<Todo[]> {
    return this.http.get<Todo[]>(this.apiURL);
  }

  updateTodo(id: number, todo: Todo) {
    for (let i = 0; i < this.todos.length; i++) {
      if (this.todos[i].id === id) {
        this.todos[i] = todo;
      }
    }
  }

  deleteTodo(id: number) {
    this.todos = this.todos.filter(todo => {
      return todo.id !== id;
    });
  }
}
