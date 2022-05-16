import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {HopDongService} from '../../../../service/furama/hop-dong/hop-dong.service';

@Component({
  selector: 'app-hop-dong-delete',
  templateUrl: './hop-dong-delete.component.html',
  styleUrls: ['./hop-dong-delete.component.css']
})
export class HopDongDeleteComponent implements OnInit {

  constructor(private activatedRoute: ActivatedRoute,
              private hopDongService: HopDongService,
              private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((param: ParamMap) => {
      const id = param.get('id');
      this.hopDongService.deletehopDong(Number(id)).subscribe(() => this.router.navigateByUrl('hop-dong/hop-dong-list'));
    });
  }

}
