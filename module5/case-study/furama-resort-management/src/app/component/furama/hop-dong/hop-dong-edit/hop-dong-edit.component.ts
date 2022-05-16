import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {HopDongService} from '../../../../service/furama/hop-dong/hop-dong.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';

@Component({
  selector: 'app-hop-dong-edit',
  templateUrl: './hop-dong-edit.component.html',
  styleUrls: ['./hop-dong-edit.component.css']
})
export class HopDongEditComponent implements OnInit {

  hopDongForm: FormGroup;
  id: number;

  constructor(private hopDongService: HopDongService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((param: ParamMap) => {
      this.id = +param.get('id');
      this.getHopDong(this.id);
    });
  }

  ngOnInit(): void {
  }

  private getHopDong(id: number) {
    return this.hopDongService.findById(id).subscribe(hopDong => {
      this.hopDongForm = new FormGroup({
        so_hop_dong: new FormControl(hopDong.so_hop_dong),
        ngay_bat_dau: new FormControl(hopDong.ngay_bat_dau),
        ngay_ket_thuc: new FormControl(hopDong.ngay_ket_thuc),
        so_tien_coc_truoc: new FormControl(hopDong.so_tien_coc_truoc),
        tong_so_tien_thanh_toan: new FormControl(hopDong.tong_so_tien_thanh_toan)
      });
    });
  }

  updateHopDong(id: number) {
    const hopDong = this.hopDongForm.value;
    this.hopDongService.updatehopDong(id, hopDong).subscribe(() => {
      alert('Cập nhật thành công');
    }, (e) => { console.log(e);
    }, () => {
      this.router.navigateByUrl('/hop-dong/hop-dong-list');
    });
  }
}
