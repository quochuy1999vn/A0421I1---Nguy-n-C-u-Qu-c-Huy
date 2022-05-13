import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {Category} from '../../../model/category';
import {ProductService} from '../../../service/product.service';
import {CategoryService} from '../../../service/category.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {

  productForm: FormGroup = new FormGroup({
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
    category: new FormControl()
  });

  categories: Category[] = [];

  constructor(private productService: ProductService,
              private categoryService: CategoryService,
              private router: Router) { }

  ngOnInit(): void {
    this.getAllCategory();
  }

  submit() {
    const product = this.productForm.value;
    this.productService.saveProduct(product).subscribe(() => {
      alert('Tạo thành công');
    }, (e) => { console.log(e);
    }, () => {
      this.router.navigateByUrl('product');
    });
  }

  getAllCategory() {
    this.categoryService.getAll().subscribe(category => {
      this.categories = category;
    });
  }
}
