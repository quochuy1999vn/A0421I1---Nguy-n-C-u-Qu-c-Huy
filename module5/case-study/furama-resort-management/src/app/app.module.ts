import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TrangChuComponent } from './component/furama/trang-chu/trang-chu.component';
import { ListComponent } from './component/furama/nhan-vien/list/list.component';
import {HttpClientModule} from '@angular/common/http';
import { KhachHangListComponent } from './component/furama/khach-hang/khach-hang-list/khach-hang-list.component';
import { EditComponent } from './component/furama/nhan-vien/edit/edit.component';
import {ReactiveFormsModule} from '@angular/forms';
import { DeleteComponent } from './component/furama/nhan-vien/delete/delete.component';
import { KhachHangEditComponent } from './component/furama/khach-hang/khach-hang-edit/khach-hang-edit.component';
import { KhachHangDeleteComponent } from './component/furama/khach-hang/khach-hang-delete/khach-hang-delete.component';
import { HopDongComponent } from './component/furama/hop-dong/hop-dong/hop-dong.component';
import {HopDongCreateComponent} from './component/furama/hop-dong/hop-dong-create/hop-dong-create.component';
import { HopDongEditComponent } from './component/furama/hop-dong/hop-dong-edit/hop-dong-edit.component';
import { HopDongDeleteComponent } from './component/furama/hop-dong/hop-dong-delete/hop-dong-delete.component';



@NgModule({
  declarations: [
    AppComponent,
    TrangChuComponent,
    ListComponent,
    KhachHangListComponent,
    EditComponent,
    DeleteComponent,
    KhachHangEditComponent,
    KhachHangDeleteComponent,
    HopDongComponent,
    HopDongCreateComponent,
    HopDongEditComponent,
    HopDongDeleteComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
