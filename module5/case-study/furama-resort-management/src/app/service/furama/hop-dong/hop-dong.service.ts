import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {HopDong} from '../../../model/hop-dong/hop-dong';
const API_URL = 'http://localhost:3000/hop-dong';

@Injectable({
  providedIn: 'root'
})
export class HopDongService {

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get<HopDong[]>(API_URL);
  }

  findById(id: number) {
    return this.http.get<HopDong>(API_URL + '/' + id);
  }

  save(hopDong) {
    return this.http.post<HopDong>(API_URL, hopDong);
  }

  updatehopDong(id: number, hopDong: HopDong) {
    return this.http.patch<HopDong>(API_URL + '/' + id, hopDong);
  }

  deletehopDong(id: number) {
    return this.http.delete<HopDong>(API_URL + '/' + id);
  }
}
