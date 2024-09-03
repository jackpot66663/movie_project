<template>
  <AppHeader />
  <div class="main-content">
    <AppSidebar />
    <router-view />
  </div>
</template>

<script>
import '@/css/app.css';

import AppHeader from './components/AppHeader.vue';
import AppSidebar from './components/AppSidebar.vue';


export default {
  name: 'App',
  components: {
    AppHeader,
    AppSidebar,
  },
};
</script>
