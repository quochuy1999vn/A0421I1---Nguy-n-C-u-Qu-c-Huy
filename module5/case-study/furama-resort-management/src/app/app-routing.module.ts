import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TrangChuComponent} from './component/furama/trang-chu/trang-chu.component';
import {ListComponent} from './component/furama/nhan-vien/list/list.component';
import {KhachHangListComponent} from './component/furama/khach-hang/khach-hang-list/khach-hang-list.component';
import {EditComponent} from './component/furama/nhan-vien/edit/edit.component';
import {DeleteComponent} from './component/furama/nhan-vien/delete/delete.component';
import {KhachHangEditComponent} from './component/furama/khach-hang/khach-hang-edit/khach-hang-edit.component';
import {KhachHangDeleteComponent} from './component/furama/khach-hang/khach-hang-delete/khach-hang-delete.component';
import {HopDongComponent} from './component/furama/hop-dong/hop-dong/hop-dong.component';
import {HopDongCreateComponent} from './component/furama/hop-dong/hop-dong-create/hop-dong-create.component';
import {HopDongEditComponent} from './component/furama/hop-dong/hop-dong-edit/hop-dong-edit.component';
import {HopDongDeleteComponent} from './component/furama/hop-dong/hop-dong-delete/hop-dong-delete.component';


const routes: Routes = [
  { path: '', component: TrangChuComponent },
  { path: 'nhan-vien/list-nhan-vien', component: ListComponent },
  { path: 'nhan-vien/nhan-vien-edit/:id', component: EditComponent},
  { path: 'nhan-vien/nhan-vien-delete/:id', component: DeleteComponent},
  { path: 'khach-hang/list-khach-hang', component: KhachHangListComponent },
  { path: 'khach-hang/khach-hang-edit/:id', component: KhachHangEditComponent},
  { path: 'khach-hang/khach-hang-delete/:id', component: KhachHangDeleteComponent},
  { path: 'hop-dong/hop-dong-list', component: HopDongComponent},
  { path: 'hop-dong/hop-dong-create', component: HopDongCreateComponent},
  { path: 'hop-dong/hop-dong-edit/:id', component: HopDongEditComponent},
  { path: 'hop-dong/hop-dong-delete/:id', component: HopDongDeleteComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
