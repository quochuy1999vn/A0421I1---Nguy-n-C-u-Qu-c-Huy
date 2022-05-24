import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {BenhNhan} from '../../../model/benh-nhan';
import {BenhAnService} from '../../../service/benh-an.service';
import {BenhNhanService} from '../../../service/benh-nhan.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  benhAnForm: FormGroup = new FormGroup({
    maBenhAn: new FormControl('', [Validators.required]),
    benhNhan: new FormControl('', [Validators.required]),
    ngayNhapVien: new FormControl('', [Validators.required]),
    ngayRaVien: new FormControl('', [Validators.required]),
    lyDoNhapVien: new FormControl('', [Validators.required]),
    phuongPhapDieuTri: new FormControl('', [Validators.required]),
    baSiDieuTri: new FormControl('', [Validators.required])
  });

  benhnhan: BenhNhan[] = [];

  constructor(private benhAnService: BenhAnService,
              private benhNhanService: BenhNhanService,
              private router: Router) { }

  ngOnInit(): void {
    this.getAllBenhNhan();
  }

  submit() {
    const benhAn = this.benhAnForm.value;
    this.benhAnService.save(benhAn).subscribe(() => {
      alert('Tạo thành công');
    }, (e) => { console.log(e);
    }, () => {
      this.router.navigateByUrl('');
    });
  }

  getAllBenhNhan() {
    this.benhNhanService.getAll().subscribe(benhNhan => {
      console.log(benhNhan);
      this.benhnhan = benhNhan;
    });
  }

}
