import { Component, OnInit } from '@angular/core';
import {IStudent} from '../../model/istudent';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {

  student: IStudent = {
    id: 1,
    name: 'Quốc Huy',
    age: 18,
    mark: 10,
    avatar: 'https://haycafe.vn/wp-content/uploads/2021/12/hinh-anh-anime-nam-1.jpg'
  };

  constructor() { }

  ngOnInit(): void {
  }

}
