import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {BenhAnService} from '../../../service/benh-an.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  benhAnForm: FormGroup;
  id: number;

  constructor(private benhAnService: BenhAnService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((param: ParamMap) => {
      this.id = +param.get('id');
      this.getBenhAn(this.id);
    });
  }

  ngOnInit(): void {
  }

  private getBenhAn(id: number) {
    return this.benhAnService.findById(id).subscribe(benhAn => {
      this.benhAnForm = new FormGroup({
        maBenhAn: new FormControl(benhAn.maBenhAn),
        benhNhan: new FormControl(benhAn.benhNhan),
        ngayNhapVien: new FormControl(benhAn.ngayNhapVien, [Validators.required]),
        ngayRaVien: new FormControl(benhAn.ngayRaVien, [Validators.required]),
        lyDoNhapVien: new FormControl(benhAn.lyDoNhapVien, [Validators.required]),
        phuongPhapDieuTri: new FormControl(benhAn.phuongPhapDieuTri, [Validators.required]),
        baSiDieuTri: new FormControl(benhAn.baSiDieuTri, [Validators.required])
      });
    });
  }

  update(id: number) {
    if (this.benhAnForm.valid) {
      const benhAn = this.benhAnForm.value;
      this.benhAnService.update(id, benhAn).subscribe(() => {
        alert('Cập nhật thành công');
      }, (e) => { console.log(e);
      }, () => {
        this.router.navigateByUrl('');
      });
    }
  }
}
