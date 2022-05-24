import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListComponent} from './component/benh-an/list/list.component';
import {EditComponent} from './component/benh-an/edit/edit.component';
import {DeleteComponent} from './component/benh-an/delete/delete.component';
import {CreateComponent} from './component/benh-an/create/create.component';


const routes: Routes = [
  {path: '', component: ListComponent},
  {path: 'create', component: CreateComponent},
  {path: 'edit/:id', component: EditComponent},
  {path: 'delete/:id', component: DeleteComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
