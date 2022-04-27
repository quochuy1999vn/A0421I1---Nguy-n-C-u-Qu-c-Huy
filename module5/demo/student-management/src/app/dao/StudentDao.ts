import {IStudent} from '../../model/istudent';

export class StudentDao {
  static studentDao: IStudent[] = [
    {
      id: 1,
      name: 'Quốc Huy',
      age: 18,
      mark: 10,
      avatar: 'https://haycafe.vn/wp-content/uploads/2021/12/hinh-anh-anime-nam-1.jpg'
    },
    {
      id: 2,
      name: 'Lê Sơn',
      age: 18,
      mark: 10,
      avatar: 'https://haycafe.vn/wp-content/uploads/2021/12/hinh-anh-anime-nam-1.jpg'
    },
    {
      id: 3,
      name: 'Việt Hoàng',
      age: 18,
      mark: 4,
      avatar: 'https://haycafe.vn/wp-content/uploads/2021/12/hinh-anh-anime-nam-1.jpg'
    },
    {
      id: 4,
      name: 'Trung Hậu',
      age: 18,
      mark: 3,
      avatar: 'https://haycafe.vn/wp-content/uploads/2021/12/hinh-anh-anime-nam-1.jpg'
    },
  ];
}
