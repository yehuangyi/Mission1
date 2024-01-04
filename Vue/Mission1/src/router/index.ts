import { createRouter, createWebHashHistory } from 'vue-router';
import Register from '@/Components/Register.vue';
import Login from '@/Components/Login.vue';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    // 其他路由配置...
    {
      path: '/',
      redirect: '/login' // 设置根路径的重定向
    },
    {
      path: '/register',
      component: Register
    },
    {
      path: '/login',
      component: Login
    }
  ]
});

export default router;