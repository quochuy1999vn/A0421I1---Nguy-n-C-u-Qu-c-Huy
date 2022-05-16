import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {KhachHangService} from '../../../../service/furama/khach-hang/khach-hang.service';

@Component({
  selector: 'app-khach-hang-delete',
  templateUrl: './khach-hang-delete.component.html',
  styleUrls: ['./khach-hang-delete.component.css']
})
export class KhachHangDeleteComponent implements OnInit {

  constructor(private activatedRoute: ActivatedRoute,
              private khachHangService: KhachHangService,
              private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((param: ParamMap) => {
      const id = param.get('id');
      this.khachHangService.deletekhachHang(Number(id)).subscribe(() => this.router.navigateByUrl('nhan-vien/list-nhan-vien'));
    });
  }

}
