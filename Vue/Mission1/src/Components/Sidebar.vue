<template>
    <div class="sidebar">
      <ul>
        <li @click="refresh">
          <router-link to="/admin/home">首页</router-link>
        </li>
        <li @click="refresh">
          <router-link to="/admin/user">用户管理</router-link>
        </li>
        <li @click="refresh">
          <router-link to="/admin/product">商品管理</router-link>
        </li>
        <li @click="refresh">
          <router-link to="/admin/order">订单管理</router-link>
        </li>
      </ul>
    </div>
  </template>
  
  <script lang="ts">
  export default {
    name: 'Sidebar',
    methods: {
      refresh() {
        this.$emit('refresh'); // 触发父组件的 refresh 事件
      },
    },
  };
  </script>
  
  <style scoped>
  .sidebar {
    background-color: #f1f1f1;
    width: 200px;
    padding: 10px;
  }
  
  ul {
    list-style-type: none;
    padding: 0;
  }
  
  li {
    margin-bottom: 10px;
  }
  
  router-link {
    color: #333;
    text-decoration: none;
  }
  </style>