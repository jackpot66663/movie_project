<template>
  <AppHeader />
  <div class="main-content">
    <AppSidebar @scrollToFooter="scrollToFooter"/>
    <router-view />
  </div>
  <AppFooter :isFooterVisible="isFooterVisible"/> 
</template>

<script>
import '@/css/app.css';

import AppHeader from './components/AppHeader.vue';
import AppSidebar from './components/AppSidebar.vue';
import AppFooter from './components/AppFooter.vue';


export default {
  name: 'App',
  components: {
    AppHeader,
    AppSidebar,
    AppFooter
  },
  data() {
    return {
      isFooterVisible: false,  // 初始不可見
    };
  },
  mounted() {
    window.addEventListener('scroll', this.handleScroll);
  },
  beforeUnmount() {
    window.removeEventListener('scroll', this.handleScroll);
  },
  methods:{
    scrollToFooter(event) {
      event.preventDefault();
      this.isFooterVisible = true;
      this.$nextTick(() => {
        const footer_element = document.getElementById('footer'); 
        if (footer_element && footer_element.scrollIntoView) {  
          footer_element.scrollIntoView({ behavior: 'smooth' });  
        } else {
          console.error('Footer element not found');
        }
      });
    },
    handleScroll() {
      const windowHeight = window.innerHeight;
      const scrollHeight = document.documentElement.scrollHeight;
      const scrollTop = window.pageYOffset || document.documentElement.scrollTop;

      
      if (scrollTop + windowHeight >= scrollHeight - 10) {
        this.isFooterVisible = true;
      } else {
        this.isFooterVisible = false;
      }
    }
  }
};
</script>
