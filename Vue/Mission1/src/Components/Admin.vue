<template>
    <div class="admin-panel">
      <h1>管理员页面</h1>
      
      <!-- 头部导航栏 -->
      <header>
        <Navbar :username="adminUsername" @logout="logout"></Navbar>
      </header>
  
      <!-- 侧边栏 -->
      <aside>
        <Sidebar @refresh="refreshContent"></Sidebar>
      </aside>
  
      <!-- 主内容区域 -->
      <main>
        <router-view :key="currentRoute"></router-view>
      </main>
  
      <!-- 底部 -->
      <footer>
        <!-- 在这里放置你的底部组件 -->
      </footer>
    </div>
  </template>
  
  <script lang="ts">
  import Navbar from '@/Components/Navbar.vue';
  import Sidebar from '@/Components/Sidebar.vue';
  
  export default {
    name: 'AdminPanel',
    components: {
      Navbar,
      Sidebar,
    },
    data() {
      return {
        adminUsername: '管理员账号名', // 替换为实际的管理员账号名
        currentRoute: 0, // 用于刷新主内容区域的标识符
      };
    },
    methods: {
      logout() {
        // 执行退出操作的逻辑
        // 例如调用 API 注销当前用户，清除本地存储的用户信息等
        //console.log('执行退出操作');
      },
      refreshContent() {
        // 刷新主内容区域的逻辑
        this.currentRoute += 1; // 增加标识符以触发重新渲染
      },
    },
  };
  </script>
  
  <style>
  .admin-panel {
    display: flex;
    flex-direction: column;
    min-height: 100vh;
  }
  </style>