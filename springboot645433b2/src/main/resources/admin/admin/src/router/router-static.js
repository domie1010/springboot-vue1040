import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import guoshuxinxi from '@/views/modules/guoshuxinxi/list'
    import caizhai from '@/views/modules/caizhai/list'
    import systemintro from '@/views/modules/systemintro/list'
    import jiaoshui from '@/views/modules/jiaoshui/list'
    import yonghu from '@/views/modules/yonghu/list'
    import guoshuleixing from '@/views/modules/guoshuleixing/list'
    import discussguoshuxinxi from '@/views/modules/discussguoshuxinxi/list'
    import yunshuzhuizong from '@/views/modules/yunshuzhuizong/list'
    import config from '@/views/modules/config/list'
    import shifei from '@/views/modules/shifei/list'
    import guoshushengchandi from '@/views/modules/guoshushengchandi/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '果蔬生产资讯',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/guoshuxinxi',
        name: '果蔬信息',
        component: guoshuxinxi
      }
      ,{
	path: '/caizhai',
        name: '采摘',
        component: caizhai
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/jiaoshui',
        name: '浇水',
        component: jiaoshui
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/guoshuleixing',
        name: '果蔬类型',
        component: guoshuleixing
      }
      ,{
	path: '/discussguoshuxinxi',
        name: '果蔬信息评论',
        component: discussguoshuxinxi
      }
      ,{
	path: '/yunshuzhuizong',
        name: '运输追踪',
        component: yunshuzhuizong
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/shifei',
        name: '施肥',
        component: shifei
      }
      ,{
	path: '/guoshushengchandi',
        name: '果蔬生产地',
        component: guoshushengchandi
      }
      ,{
	path: '/newstype',
        name: '果蔬生产资讯分类',
        component: newstype
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
