import { Injectable } from '@angular/core';
import {Todo} from './todo';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
const API_CONNECT = 'http://localhost:3000/todo';

@Injectable({
  providedIn: 'root'
})

export class TodoService {


  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Todo[]> {
    return this.httpClient.get<Todo[]>(API_CONNECT);
  }

  createTodo(todo): Observable<Todo> {
    return this.httpClient.post<Todo>(API_CONNECT, todo);
  }

  deleteTodo(id: number): Observable<Todo> {
    return this.httpClient.get<Todo>(API_CONNECT + '/' + id);
  }

  findById(id: number): Observable<Todo> {
    return this.httpClient.get<Todo>(API_CONNECT + '/' + id);
  }
}
