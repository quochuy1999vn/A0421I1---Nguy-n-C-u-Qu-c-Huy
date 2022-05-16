import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {NhanVienService} from '../../../../service/furama/nhan-vien/nhan-vien.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  nhanVienForm: FormGroup;
  id: number;


  trinhDo = ['Trung Cấp', 'Cao Đẳng', 'Đại Học', 'Sau đại học'];

  viTri = ['Lễ Tân', 'Phục vụ', 'Chuyên viên', 'Giám sát', 'Quản lý', 'Giám đốc'];

  constructor(private nhanVienService: NhanVienService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((param: ParamMap) => {
      this.id = +param.get('id');
      this.getNhanVien(this.id);
    });
  }

  ngOnInit(): void {
  }

  private getNhanVien(id: number) {
    return this.nhanVienService.findById(id).subscribe(nhanVien => {
    this.nhanVienForm = new FormGroup({
      ho_ten: new FormControl(nhanVien.ho_ten),
      ngay_sinh: new FormControl(nhanVien.ngay_sinh),
      cmnd: new FormControl(nhanVien.cmnd),
      sdt: new FormControl(nhanVien.sdt),
      email: new FormControl(nhanVien.email),
      trinh_do: new FormControl(nhanVien.trinh_do),
      vi_tri: new FormControl(nhanVien.vi_tri),
      luong: new FormControl(nhanVien.luong),
    });
    });
  }

  updateNhanVien(id: number) {
    const nhanVien = this.nhanVienForm.value;
    this.nhanVienService.updateNhanVien(id, nhanVien).subscribe(() => {
      alert('Cập nhật thành công');
    }, (e) => { console.log(e);
    }, () => {
      this.router.navigateByUrl('/nhan-vien/list-nhan-vien');
    });
  }
}
