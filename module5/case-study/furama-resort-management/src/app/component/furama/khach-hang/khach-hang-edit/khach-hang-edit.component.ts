import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {KhachHangService} from '../../../../service/furama/khach-hang/khach-hang.service';

@Component({
  selector: 'app-khach-hang-edit',
  templateUrl: './khach-hang-edit.component.html',
  styleUrls: ['./khach-hang-edit.component.css']
})
export class KhachHangEditComponent implements OnInit {

  khachHangForm: FormGroup;
  id: number;


  loaiKhach = ['Diamond', 'Platinium', 'Gold', 'Silver', 'Member'];

  dichVu = ['Villa', 'House', 'Room'];

  gioiTinh = ['Nam', 'Nữ', 'Khác'];

  constructor(private khachHangService: KhachHangService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((param: ParamMap) => {
      this.id = +param.get('id');
      this.getKhachHang(this.id);
    });
  }

  ngOnInit(): void {
  }

  private getKhachHang(id: number) {
    return this.khachHangService.findById(id).subscribe(khachHang => {
      this.khachHangForm = new FormGroup({
        ho_ten: new FormControl(khachHang.ho_ten),
        ngay_sinh: new FormControl(khachHang.ngay_sinh),
        gioi_tinh: new FormControl(khachHang.gioi_tinh),
        cmnd: new FormControl(khachHang.cmnd),
        sdt: new FormControl(khachHang.sdt),
        email: new FormControl(khachHang.email),
        loai_khach: new FormControl(khachHang.loai_khach),
        dia_chi: new FormControl(khachHang.dia_chi),
        dich_vu: new FormControl(khachHang.dich_vu)
      });
    });
  }

  updateKhachHang(id: number) {
    const khachHang = this.khachHangForm.value;
    this.khachHangService.updatekhachHang(id, khachHang).subscribe(() => {
      alert('Cập nhật thành công');
    }, (e) => { console.log(e);
    }, () => {
      this.router.navigateByUrl('/khach-hang/list-khach-hang');
    });
  }

}
