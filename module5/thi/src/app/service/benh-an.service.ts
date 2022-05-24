import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BenhAn} from '../model/benh-an';
const API_URL = 'http://localhost:8080/api/benhAn';

@Injectable({
  providedIn: 'root'
})
export class BenhAnService {

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get<BenhAn[]>(API_URL);
  }

  findById(id: number) {
    return this.http.get<BenhAn>(API_URL + '/' + id);
  }

  save(benhAn) {
    return this.http.post<BenhAn>(API_URL, benhAn);
  }

  update(id: number, benhAn: BenhAn) {
    return this.http.patch<BenhAn>(API_URL + '/' + id, benhAn);
  }

  delete(id: number) {
    return this.http.delete<BenhAn>(API_URL + '/' + id);
  }

}
