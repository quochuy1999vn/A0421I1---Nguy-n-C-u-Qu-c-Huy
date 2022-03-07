import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListTodoComponent} from './list-todo/list-todo.component';
import {CreateTodoComponent} from './create-todo/create-todo.component';
import {EditTodoComponent} from './edit-todo/edit-todo.component';
import {DeleteTodoComponent} from './delete-todo/delete-todo.component';


const routes: Routes = [
  {
    path: 'list', component: ListTodoComponent
  },
  {
    path: 'create', component: CreateTodoComponent
  },
  {
    path: 'edit/:id', component: EditTodoComponent
  },
  {
    path: 'delete/:id', component: DeleteTodoComponent
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TodoRoutingModule { }
