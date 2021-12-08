import axios from 'axios';
const http =  axios.create({
    baseURL: "http://localhost:8080"
  });
  export default{
    list() {
        return http.get('/item');
      },
    
      get(id) {
        return http.get(`/item/${id}`);
      },
      create(item) {
        return http.post('/item',item);
      },
      update(id, item) {
        return http.put('/item/:{id}',item);
      },
      delete(id) {
        return http.delete(`/item/${id}`);
    
    
    }
    
      
  }