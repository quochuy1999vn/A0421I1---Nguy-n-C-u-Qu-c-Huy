import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {NhanVienService} from '../../../../service/furama/nhan-vien/nhan-vien.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  constructor(private activatedRoute: ActivatedRoute,
              private nhanVienService: NhanVienService,
              private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((param: ParamMap) => {
      const id = param.get('id');
      this.nhanVienService.deleteNhanVien(Number(id)).subscribe(() => this.router.navigateByUrl('nhan-vien/list-nhan-vien'));
  });
  }
}
