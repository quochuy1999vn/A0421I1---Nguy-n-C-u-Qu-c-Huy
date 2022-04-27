import { Component, OnInit } from '@angular/core';
import {IStudent} from '../../model/istudent';
import {StudentDao} from '../dao/StudentDao';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  students: IStudent[] = StudentDao.studentDao;

  constructor() { }

  ngOnInit(): void {
  }

}
