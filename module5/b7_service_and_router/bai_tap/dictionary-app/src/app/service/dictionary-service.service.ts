import { Injectable } from '@angular/core';
import {IWord} from '../model/iword';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {

  dictionary: IWord[] = [
    {
      id: '1',
      word: 'hello',
      mean: 'xin chào'
    },
    {
      id: '2',
      word: 'bye',
      mean: 'tạm biệt'
    },
    {
      id: '3',
      word: 'red',
      mean: 'màu đỏ'
    }
  ];

  constructor() { }

  getAll() {
    return this.dictionary;
  }

  findById(id: string) {
    return this.dictionary.find((dictionarys) => dictionarys.id === id);
  }
}
