<template>
    <header class="app-header">
      <h1 class="head-title">Jackpot Inc.</h1>
    </header>
  </template>
  
  <script>
  export default {
    name: 'AppHeader',
  };
  </script>
  
  <style scoped>
  .app-header {
    z-index: 2;
    position: relative;
    background-color: #0A1828;
    padding: 10px;
    text-align: center;
    height: 60px;
    position: fixed;
    width: 100%;
    top: 0;
    left: 0;
  }
  .head-title{
    font-family: BrandonGrotesqueWeb-Thin, sans-serif;
    color: #deb992;
    font-size: 25px;
    font-weight: 100;
  }
  </style>