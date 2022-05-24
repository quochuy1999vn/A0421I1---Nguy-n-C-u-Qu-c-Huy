import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {BenhAnService} from '../../../service/benh-an.service';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  benhAnForm: FormGroup;
  id: number;

  constructor(private benhAnService: BenhAnService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((param: ParamMap) => {
      this.id = +param.get('id');
      this.benhAnService.delete(this.id).subscribe(next => this.router.navigateByUrl(''));
      // this.getBenhAn(this.id);
    });
  }

  ngOnInit(): void {
  }

  // private getBenhAn(id: number) {
  //   return this.benhAnService.findById(id).subscribe(benhAn => {
  //     this.benhAnForm = new FormGroup({
  //       maBenhAn: new FormControl(benhAn.maBenhAn),
  //       maBenhNhan: new FormControl(benhAn.maBenhNhan),
  //       tenBenhNhan: new FormControl(benhAn.tenBenhNhan),
  //       ngayNhapVien: new FormControl(benhAn.ngayNhapVien),
  //       ngayRaVien: new FormControl(benhAn.ngayRaVien),
  //       lyDoNhapVien: new FormControl(benhAn.lyDoNhapVien),
  //       phuongPhapDieuTri: new FormControl(benhAn.phuongPhapDieuTri),
  //       baSiDieuTri: new FormControl(benhAn.baSiDieuTri)
  //     });
  //   });
  // }
  //
  // delete(id: number) {
  //   this.benhAnService.delete(id).subscribe(() => {
  //     alert('Xoá Thành Công');
  //   }, (e) => { console.log(e);
  //   }, () => {
  //     this.router.navigateByUrl('');
  //   });
  // }

}
