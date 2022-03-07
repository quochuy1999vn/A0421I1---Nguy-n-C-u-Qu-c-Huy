import { NgModule } from '@angular/core';

import { TodoRoutingModule } from './todo-routing.module';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import {AppComponent} from '../app.component';
import {DeleteTodoComponent} from './delete-todo/delete-todo.component';
import {EditTodoComponent} from './edit-todo/edit-todo.component';
import {CreateTodoComponent} from './create-todo/create-todo.component';
import { ListTodoComponent } from './list-todo/list-todo.component';
import {CommonModule} from '@angular/common';


@NgModule({
  declarations: [
    EditTodoComponent,
    DeleteTodoComponent,
    CreateTodoComponent,
    ListTodoComponent
  ],
    imports: [
        CommonModule,
        TodoRoutingModule,
        FormsModule,
        ReactiveFormsModule,
        HttpClientModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class TodoModule { }
