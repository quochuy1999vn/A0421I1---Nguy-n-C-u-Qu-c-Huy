import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from "../../service/product.service";
import {ActivatedRoute, Router} from "@angular/router";
import {Product} from "../../model/product";

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {

  product: Product[] = [];

  productForm: FormGroup;

  id: number;

  constructor(private productService: ProductService,
              private activatedRouter: ActivatedRoute,
              private router: Router) {
    this.activatedRouter.paramMap.subscribe((param) => {
      this.id = +param.get('id');
      const product = this.getProduct(this.id);
      this.productForm = new FormGroup({
        id: new FormControl(),
        name: new FormControl(),
        price: new FormControl(),
        description: new FormControl(),
      });
    });
  }

  ngOnInit() {
  }

  private getProduct(id: number) {
    return this.productService.findById(id);
  }

  deleteProduct(id: number) {
    this.productService.deleteProduct(id);
    this.router.navigate(['/product/list']);
  }
}
