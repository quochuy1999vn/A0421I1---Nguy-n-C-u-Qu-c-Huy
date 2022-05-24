import { Component, OnInit } from '@angular/core';
import {BenhAn} from '../../../model/benh-an';
import {BenhAnService} from '../../../service/benh-an.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  benhAn: BenhAn[];

  constructor(private benhAnService: BenhAnService) { }

  ngOnInit(): void {
    this.benhAnService.getAll().subscribe(res => {

      console.log(res);
      this.benhAn = res;
    }, error => {
      console.log(error);
    });
  }

}
