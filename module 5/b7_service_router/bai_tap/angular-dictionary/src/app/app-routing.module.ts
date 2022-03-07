import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DetailComponent} from './dictionary/detail/detail.component';
import {ListComponent} from './dictionary/list/list.component';


const routes: Routes = [
  {
    path: 'home',
    component: ListComponent,
    children:[
      {
        path: ':word',
        component: DetailComponent
      }
    ]

  },
  {path: '', redirectTo: 'home', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
