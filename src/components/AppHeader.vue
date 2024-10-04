<template>
  <header class="app-header">
    <h1 class="head-title">Jackpot Inc.</h1>
    <div class="cart-icon" @click="movie_list_popup">
      <font-awesome-icon :icon="['fas', 'shopping-cart']" style="color: #deb992;"/>
    </div>
  </header>
  <!-- 電影單彈窗 -->
  <div v-if="show_movie_list" class="list-overlay">
    <MovieList @shut_down_list="shutdownlist"/>
  </div>
</template>

<script>
import MovieList from './MovieList.vue';
export default {
  name: 'AppHeader',
  components:{
    MovieList,
  },
  data() {
    return {
      show_movie_list: false,
    };
  },
  methods:{
    movie_list_popup(){
      document.body.style.overflow = 'hidden';
      this.show_movie_list = !this.show_movie_list;
    },
    shutdownlist(){
      // console.log(123)
      this.show_movie_list = !this.show_movie_list;
    },
  }
};
</script>

<style scoped>
.app-header {
  display: flex;
  justify-content: space-between; 
  z-index: 2;
  position: relative;
  background-color: #0A1828;
  padding: 10px;
  align-items: center;
  /* text-align: center; */
  height: 60px;
  position: fixed;
  width: 100%;
  top: 0;
  left: 0;
}
.head-title{
  font-family: BrandonGrotesqueWeb-Thin, sans-serif;
  color: #deb992;
  font-size: 40px;
  font-weight: 100;
}
.cart-icon{
  font-size: 20px;
  cursor: pointer;
  margin-right: 50px;
  margin-top: 10px;
}
.cart-icon:hover {
  color: #deb992;
  transform: scale(1.2);
}

.list-overlay{
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: rgba(0, 0, 0, 0.5);
  z-index: 1000;
}
</style>