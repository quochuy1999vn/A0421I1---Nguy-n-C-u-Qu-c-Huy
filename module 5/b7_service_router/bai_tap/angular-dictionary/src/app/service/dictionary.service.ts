import { Injectable } from '@angular/core';
import {Dictionary} from '../model/dictionary';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {

  dictionary: Dictionary[] = [
    {
      id: 1,
      word: 'tree',
      mean: 'cây'
    },
    {
      id: 2,
      word: 'bye',
      mean: 'tạm biệt'
    },
    {
      id: 3,
      word: 'hello',
      mean: 'xin chào'
    },
    {
      id: 4,
      word: 'window',
      mean: 'cửa sổ'
    }
  ];

  constructor() {
  }

  getAll() {
    return this.dictionary;
  }

  getByWord(id: number) {
    return this.dictionary.find(x => x.id === id);
  }
}
