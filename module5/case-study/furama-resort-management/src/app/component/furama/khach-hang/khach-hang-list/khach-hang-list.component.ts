import { Component, OnInit } from '@angular/core';
import {KhachHang} from '../../../../model/khach-hang/khach-hang';
import {KhachHangService} from '../../../../service/furama/khach-hang/khach-hang.service';

@Component({
  selector: 'app-khach-hang-list',
  templateUrl: './khach-hang-list.component.html',
  styleUrls: ['./khach-hang-list.component.css']
})
export class KhachHangListComponent implements OnInit {

  khachHang: KhachHang[];

  constructor(private khachHangService: KhachHangService) { }

  ngOnInit(): void {
    this.khachHangService.getAll().subscribe(res => {
      // @ts-ignore
      this.khachHang = res;
    });
  }

}
