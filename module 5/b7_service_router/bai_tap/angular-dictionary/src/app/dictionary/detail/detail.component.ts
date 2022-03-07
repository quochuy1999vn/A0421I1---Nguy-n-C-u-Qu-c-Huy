import { Component, OnInit } from '@angular/core';
import {Dictionary} from '../../model/dictionary';
import {DictionaryService} from '../../service/dictionary.service';
import {ActivatedRoute, ParamMap} from '@angular/router';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {

  dictionary: Dictionary;

  constructor(private dictionaryService: DictionaryService,
              private  activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = paramMap.get('id');
      this.dictionary = this.dictionaryService.getByWord(Number(id));
    });
  }

}
