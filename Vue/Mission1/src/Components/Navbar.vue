<template>
    <div class="navbar">
      <div class="admin-name">管理员：{{ username }}</div>
      <button class="logout-button" @click="logout">退出</button>
    </div>
  </template>
  
  <script lang="ts">
  export default {
    name: 'Navbar',
    props: {
      username: {
        type: String,
        required: true,
      },
    },
    methods: {
      logout() {
        this.$emit('logout'); // 触发父组件的 logout 事件
      },
    },
  };
  </script>
  
  <style scoped>
  .navbar {
    background-color: #f1f1f1;
    padding: 10px;
  }
  
  .admin-name {
    font-size: 18px;
    font-weight: bold;
  }
  
  .logout-button {
    background-color: #f44336;
    color: white;
    padding: 5px 10px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  }
  </style>