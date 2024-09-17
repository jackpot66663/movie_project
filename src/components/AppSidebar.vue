<template>
    <aside class="app-sidebar">
      <ul>
        <li><router-link to="/">What New</router-link></li>
        <li><router-link to="/about">About Me</router-link></li>
        <li><a href="#" @click="scrollToFooter">Contact</a></li>
      </ul>
    </aside>
  </template>
  
  <script>
  export default {
    name: 'AppSidebar',
    methods: {
    scrollToFooter(event) {
      this.$emit('scrollToFooter',event);  // 向父組件發送事件
    }
  }
  };
  </script>
  
  <style scoped>
  .app-sidebar {
    background-color: #0A1828;
    width: 200px;
    padding: 15px;
    position: fixed;
    top: 60px;
    left: 0;
    height: calc(100% - 60px); /* 確保 sidebar 填滿剩餘的高度 */
    z-index: 1;
  }
  .app-sidebar ul {
    list-style-type: none;
    padding: 0;
  }
  .app-sidebar ul li {
    margin-bottom: 10px;
  }
  .app-sidebar ul li a {
    text-decoration: none;
    color: #BFA181;
    font-size:20px;
    font-family: BrandonGrotesqueWeb-Thin, sans-serif;
  }
  </style>
  