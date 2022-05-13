import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductListComponent} from './component/product/product-list/product-list.component';
import {ProductCreateComponent} from './component/product/product-create/product-create.component';
import {CategoryListComponent} from './component/category/category-list/category-list.component';
import {CategoryCreateComponent} from './component/category/category-create/category-create.component';
import {ProductEditComponent} from './component/product/product-edit/product-edit.component';
import {ProductDeleteComponent} from './component/product/product-delete/product-delete.component';


const routes: Routes = [
  {
    path: 'product',
    component: ProductListComponent
  },
  {
    path: 'product/create',
    component: ProductCreateComponent
  },
  {
    path: 'product/edit/:id',
    component: ProductEditComponent
  },
  {
    path: 'product/delete/:id',
    component: ProductDeleteComponent
  },
  {
    path: 'categories',
    component: CategoryListComponent
  },
  {
    path: 'categories/create',
    component: CategoryCreateComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
