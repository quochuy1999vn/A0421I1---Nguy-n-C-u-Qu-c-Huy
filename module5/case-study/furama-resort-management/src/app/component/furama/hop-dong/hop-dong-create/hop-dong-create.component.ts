import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {HopDongService} from '../../../../service/furama/hop-dong/hop-dong.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-hop-dong-create',
  templateUrl: './hop-dong-create.component.html',
  styleUrls: ['./hop-dong-create.component.css']
})
export class HopDongCreateComponent implements OnInit {

  hopDongForm: FormGroup = new FormGroup({
    so_hop_dong: new FormControl(),
    ngay_bat_dau: new FormControl(),
    ngay_ket_thuc: new FormControl(),
    so_tien_coc_truoc: new FormControl(),
    tong_so_tien_thanh_toan: new FormControl()
  });

  constructor(private hopDongService: HopDongService,
              private router: Router) { }

  ngOnInit(): void {
  }

  onSubmit() {
    const hopDong = this.hopDongForm.value;
    this.hopDongService.save(hopDong).subscribe(() => {
      alert('Tạo thành công');
    }, (e) => { console.log(e);
    }, () => {
      this.router.navigateByUrl('hop-dong/hop-dong-list');
    });
  }

}
