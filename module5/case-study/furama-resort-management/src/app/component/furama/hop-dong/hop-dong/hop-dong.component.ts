import { Component, OnInit } from '@angular/core';
import {HopDong} from '../../../../model/hop-dong/hop-dong';
import {HopDongService} from '../../../../service/furama/hop-dong/hop-dong.service';

@Component({
  selector: 'app-hop-dong',
  templateUrl: './hop-dong.component.html',
  styleUrls: ['./hop-dong.component.css']
})
export class HopDongComponent implements OnInit {

  hopDong: HopDong[];

  constructor(private hopDongService: HopDongService) { }

  ngOnInit(): void {
    this.hopDongService.getAll().subscribe(res => {
      this.hopDong = res;
    });
  }

}
