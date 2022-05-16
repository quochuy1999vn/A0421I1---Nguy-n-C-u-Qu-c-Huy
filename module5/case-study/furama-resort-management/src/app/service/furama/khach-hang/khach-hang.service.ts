import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {KhachHang} from '../../../model/khach-hang/khach-hang';
const API_CONNECT = 'http://localhost:3000/khach-hang';

@Injectable({
  providedIn: 'root'
})
export class KhachHangService {

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get<KhachHang[]>(API_CONNECT);
  }

  findById(id: number) {
    return this.http.get<KhachHang>(API_CONNECT + '/' + id);
  }

  updatekhachHang(id: number, khachHang: KhachHang) {
    return this.http.patch<KhachHang>(API_CONNECT + '/' + id, khachHang);
  }

  deletekhachHang(id: number) {
    return this.http.delete<KhachHang>(API_CONNECT + '/' + id);
  }
}
