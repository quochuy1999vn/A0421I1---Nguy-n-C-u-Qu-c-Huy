import { Component, OnInit } from '@angular/core';
import {NhanVienService} from '../../../../service/furama/nhan-vien/nhan-vien.service';
import {NhanVien} from '../../../../model/nhan-vien/nhan-vien';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  nhanVien: NhanVien[];

  constructor(private nhanVienService: NhanVienService) { }

  ngOnInit(): void {
    this.nhanVienService.getAll().subscribe(res => {
      this.nhanVien = res;
    });
  }

}
