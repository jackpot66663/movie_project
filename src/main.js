import { createApp } from 'vue'
import { createHead } from '@vueuse/head'
import App from './App.vue'
import router from './router'
import { library } from '@fortawesome/fontawesome-svg-core'
import { faPhone, faEnvelope } from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'

library.add(faPhone,faEnvelope)


const app = createApp(App)
const head = createHead()
app.use(head)
app.use(router)
app.component('font-awesome-icon', FontAwesomeIcon)

app.mount('#app')
