import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BenhNhan} from '../model/benh-nhan';

const API_URL = 'http://localhost:3000/benh-nhan';

@Injectable({
  providedIn: 'root'
})
export class BenhNhanService {

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get<BenhNhan[]>(API_URL);
  }

  findById(id: number) {
    return this.http.get<BenhNhan>(API_URL + '/' + id);
  }

  update(id: number, benhNhan: BenhNhan) {
    return this.http.patch<BenhNhan>(API_URL + '/' + id, benhNhan);
  }

  delete(id: number) {
    return this.http.delete<BenhNhan>(API_URL + '/' + id);
  }

}
